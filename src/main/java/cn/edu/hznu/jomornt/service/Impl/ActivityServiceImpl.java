package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.Activity;
import cn.edu.hznu.jomornt.bean.ActivityExample;
import cn.edu.hznu.jomornt.dao.ActivityMapper;
import cn.edu.hznu.jomornt.service.ActivityService;
import cn.edu.hznu.jomornt.utils.FTPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityMapper activityMapper;

    public List<Activity> getActivity(String id) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List activityInfo = activityMapper.selectByExample(example);
        return  activityInfo;
    }

    public List<Activity> getTbl() {
        return activityMapper.selectByExample(null);
    }

    public String upload(MultipartFile file, String path){
        String fileName = file.getOriginalFilename();
        //扩展名
        String fileExtensionName = fileName.substring(fileName.lastIndexOf('.')+1);
        //UUID防止文件名重复
        String uploadFileName = UUID.randomUUID().toString() + "." + fileExtensionName;
        System.out.println("开始上传文件，上传的文件名：{"+fileName+"}，上传的路径：{"+path+"}，新文件名： "+uploadFileName);
        File fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        File targetFile = new File(path,uploadFileName);
        try {
            file.transferTo(targetFile);
            FTPUtil ftpUtil = new FTPUtil("172.18.20.163","jomornt","19980802");
            ftpUtil.uploadFile(uploadFileName,path+"\\"+uploadFileName);
            targetFile.delete();

        } catch (Exception e) {
            return null;
        }
        return  targetFile.getName();
    }
    public int updateActAll(Activity activity) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(activity.getId());
        return activityMapper.updateByExampleSelective(activity,example);
    }

    public int updateAct(Activity activity) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(activity.getId());
        return activityMapper.updateByExampleSelective(activity,example);
    }

    public void deleteActivit(String id) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        activityMapper.deleteByExample(example);
    }

    public List<Activity> getTblWithCategory(String category) {
        ActivityExample example = new ActivityExample();
        ActivityExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryEqualTo(category);
        return activityMapper.selectByExample(example);
    }

    public int addAct(Activity activity) {
        return activityMapper.insertSelective(activity);
    }
    public List<Activity> getSearch (String keyword){
        return activityMapper.selectBykeyWord(keyword);
    }
}
