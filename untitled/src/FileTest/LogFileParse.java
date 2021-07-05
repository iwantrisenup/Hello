package FileTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogFileParse
{
    public static List<String> loadLogFile(String path) throws IOException
    {
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader input = new BufferedReader(new InputStreamReader(fstream));
        String line;
        List<String> list = new ArrayList<String>();
        while((line = input.readLine())!=null)
        {
            String temp = TakeWord(line);
            list.add(temp);
        }
        return list;
    }

    private static String TakeWord(String line)
    {
        String sourceName = "sourceName";
        int len = sourceName.length();
        int start = 0;
        int end = 0;
        String value = null;
        for(int i = 0;i<line.length();i++)
        {
            if(line.charAt(i)=='S'&&i+len<line.length())
            {
                if(line.substring(i,i+len).equals(sourceName))
                {
                    value = GetValue(i+len,line);
                    break;
                }
            }
        }
        return value;
    }

    private static String GetValue(int end,String line)
    {
        int start = 0;
        int count = 0;
        int flag = 0;
        for(int j =end+3;j<line.length();j++)
        {
            if (line.charAt(j)==',')
            {
                count = j-1;
                break;
            }
            if(String.valueOf(line.charAt(j)).equals("")&&flag==0)
            {
                start = j;
                flag = 1;
            }
            else
            {
                if(flag==0)
                    return null;
            }
        }
        return line.substring(start,count);
    }
}
