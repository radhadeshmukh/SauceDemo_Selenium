package Baseclasses;

import java.nio.file.*;;
public class Readnotepad
{
  public static String readFileAsString(String fileName)throws Exception
  {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }
}
/*
 * public static void main(String[] args) throws Exception { String data =
 * readFileAsString("src/main/java/Baseclasses/notepad");
 * System.out.println(data); } }
 */