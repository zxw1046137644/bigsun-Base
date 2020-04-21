import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class day6IOTest {


    /**
     * IO流的使用
     * 1.File类,代表一个文件或者一个文件夹
     * create 2020.4.20 bigsun
     */


    @Test//("File类的实例化")
    public void test1() {
        File file = new File("fil.txt");
        System.out.println(file);
        File file1 = new File("d:", "path");
        System.out.println(file1);
        File file2 = new File(file1, "fil.txt");
        System.out.println(file2);
    }


    /**
     * 获取绝对路径：getAbsolutePath()
     * 获取Name：getName()
     * 获取父目录：getParent()
     * 获取文件长度：length() ,字节数
     * 获取最近一次的修改时间：lastModified() 毫秒
     * 获取下级文件目录 list()
     * 获取子目录路径：listFies()
     * 重命名：renameTo()
     */
    @Test//file常用方法
    public void test2() {
        File file = new File("file1.txt");
        String abs = file.getAbsolutePath();
        String name = file.getName();
        String parent = file.getParent();
        long modified = file.lastModified();
        long length = file.length();
        System.out.println(abs);
        System.out.println(name);
        System.out.println(parent);
        System.out.println(modified);
        System.out.println(length);
        /**
         * 获取子目录名称
         */
        File fileList = new File("F:\\server\\base-test");
        String[] list = fileList.list();
        for (String s : list) {
            System.out.println(s);
        }
        /**
         * 获取子目录路径
         */
        File[] files = fileList.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        /**
         * 重命名文件
         */
        File fileRename = new File("rename");
        file.renameTo(fileRename);

    }

    @Test//file常用方法2
    /**
     * 判断是否文件目录:isDirectory
     * 判断是否文件isFile
     * 判断文件是否存在exists
     * 判断文件是否可读canRead
     * 判断文件是否可写canWrite
     * 判断文件是否隐藏isHidden
     */
    public void test3() {
        File file = new File("rename");
        System.out.println(file.isHidden());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }


    /**
     * 创建文件：createNewFile
     * 文件目录：
     * 删除文件：delete
     * 文件目录：
     */
    @Test
    public void test4() throws IOException {
        File file = new File("file1.txt");
        if (!file.exists()) {
            System.out.println("新增成功");
            file.createNewFile();

        }
        if (file.exists()) {
            file.delete();
            System.out.println("删除成功");
        }

    }

    @Test
    public void test5() {
        File file = new File("dictory\\two\\three");
        File file1 = new File("dictory2\\two2\\three2");
        file1.mkdir();
        file.mkdirs();

    }
}
