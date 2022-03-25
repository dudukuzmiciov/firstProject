package Class24AbstractInterface;

    /*Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract. Create 3 subclasses:
      JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
      Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
       Microsoft word to be installed etc
     */
    abstract class File{
       abstract void Open();
       void Edit(){
            System.out.println("Please edit");
       }
        void Close(){
            System.out.println("Please close the file");
       }

    }
    class JavaFile extends File{
        void Open(){
            System.out.println("to open .java file we need notepad++ or sublime text");
        }
    }
    class WordFile extends File{
        void Open(){
            System.out.println("to open .doc file we need Microsoft word to be installed");
        }
    }
    class PdfFile extends File{
        void Open(){
            System.out.println("to open .pdf file install Adobe");
        }
    }
    public class Task1 {
        public static void main(String[] args) {
            //if a method is not present inside the parent class we cant call that method using polymorphism
            // Object[] files={new JavaFile(),.....}
            // Object[0]. ->wont work
            File[] file={new JavaFile(), new WordFile(),new PdfFile()};
            for (int i=0;i<file.length;i++){
                file[i].Open();
                file[i].Edit();
                file[i].Close();

                //OR WHILE LOOP METHOD:

                /*File[] file={new JavaFile(), new WordFile(),new PdfFile()};
                int i =0;
                while(i < file.length){
                    file[i].Open();
                    file[i].Edit();
                    file[i].Close();
                    i++;
                   */

            }
        }

    }


