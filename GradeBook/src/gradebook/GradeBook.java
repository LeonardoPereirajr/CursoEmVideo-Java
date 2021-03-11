package gradebook;

public class GradeBook
{
 private String courseName;
 
 
 public void setCourseName(String name)//metodo para configurar nome do curso
 {
     courseName = name;//armazena o nome do curso
 }
 
 
 public String getCourseName()//metodo para recuperar o nome do curso
 {
     return courseName;
 }
 
 
 public void displayMessage() //exibe mensagem
    {
      System.out.printf( "Welcome to the Grade Book for\n%s!\n", getCourseName());
    }
  } 