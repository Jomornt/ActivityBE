package cn.edu.hznu.jomornt.service;

import cn.edu.hznu.jomornt.bean.Activity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ActivityService {
    List<Activity> getActivity(String id);
    List<Activity> getTbl();
    String upload(MultipartFile file, String path);
    int updateActAll(Activity activity);
    int updateAct(Activity activity);
    void deleteActivit(String id);
    List<Activity> getTblWithCategory(String category);
    int addAct(Activity activity);
    List<Activity> getSearch (String keyword);
}
