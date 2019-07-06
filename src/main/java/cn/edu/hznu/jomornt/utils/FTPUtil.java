package cn.edu.hznu.jomornt.utils;
import java.io.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTP;

public class FTPUtil implements AutoCloseable {

    private FTPClient ftpClient;

    public FTPUtil(String serverIP, String userName, String password) throws IOException {
        ftpClient = new FTPClient();
        ftpClient.connect(serverIP,21);
        boolean flag = ftpClient.login(userName, password);
        System.out.println("连接结果"+flag);
        ftpClient.setBufferSize(1024);//设置上传缓存大小
        ftpClient.setControlEncoding("UTF-8");//设置编码
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);//设置文件类型
    }

    public boolean uploadFile(String remoteFileName, String localFile) throws IOException {
        boolean isSucc;
        try (InputStream inputStream = new FileInputStream(localFile)) {
            if (ftpClient == null)
                throw new IOException("ftp server not login");
            isSucc = ftpClient.storeFile(remoteFileName, inputStream);
        }
        System.out.println("上传成功："+isSucc);
        return isSucc;
    }

    @Override
    public void close() throws Exception {
        if (ftpClient != null && ftpClient.isConnected()) {
            ftpClient.logout();
            ftpClient.disconnect();
        }
    }
}

