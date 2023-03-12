import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class lection2_241122 {
    public static void main(String[] args) {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
    }
}


// Что такое API в Java - это возможности, которые предлагают разработчики языка для удобного взаимодействия с его функциями.
// Примеры: 
// 1. Строки
// 2. Работа с файловой системой
// 3. Логирование
// 4. Импорт
// 5. XML


// РАБОТА СО СТРОКАМИ. ПРИМЕР.
// Создать строку из 1 млн плюсиков.
class plusiki {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s + " ms");
    }
}

// Какой функционал есть в типе данных String:
// concat(): объединение строк
// value(): преобразует Object в строковое представление (завязан на toString)
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith/endsWidth(): определяет начинается/заканчивается ли строка с подстроки
// replace(): замена одной строки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку см. аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// compareTo: сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// Когда много изменений применяется String
// Когда много преобразований применяется StringBuilder



// РАБОТА С ФАЙЛОВОЙ СИСТЕМОЙ
// КАТАЛОГИ И ФАЙЛЫ

// Для работы нужно:
// File<имя> = new File(<полный путь к файлу>);

// Что предпочтительнее?
// file f1 = new File("file_seminar2Java.txt");
// или
// file f2 = new File(/Users/sk/vscode/java_projects/file_seminar2Java.txt")
// Учитывая, что язык Java кроссплатформенный, необходимо помнить, что на разных платформах разная файловая система и пути к файлам у них разные.

// class fileSystemDemo {
//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathFile = pathProject.concat("/file.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());

//         System.out.println(pathFile);
//         File f1 = new File("file1_Seminar2Java.txt");
//         File f2 = new File("/home/n/Downloads/GB/Repo_GitHub/file2_Seminar2Java.txt");
//         System.out.println(f1.getAbsolutePath());
//         System.out.println(f2.getAbsolutePath());
//     }
// }

// чтобы исключить ошибки, нужно их обрабатывать.
// Для обработки ошибок используются блоки try, catch, finally
// try {
//     Код, в котором может появиться ошибка
// } catch (Exception e) {
//     Обработка, если ошибка случилась
// } finally {
//     Код, который выполнится в любом случае
// }

// class tryDemo {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File f3 = new File(pathFile);
//             System.out.println("try");
//         } catch (Exception e) {
//             System.out.println("catch");
//         } finally {
//             System.out.println("Finally");
//         }
//     }
// }


// class Ex003_tryDemo {
//     public static void main(String[] args) {
//         String line = "empty";
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);

//             if (file.createNewFile()) {
//                 System.out.println("file.created");
//             }
//             else {
//                 System.out.println("file.existed");
//                 FileWriter fileWriter = new FileWriter(file, true);
//                 fileWriter.write("new line");

//                 //#region lineSeparator
//                 // A string containing "\r\n" for non-Unix 
//                 // platforms, or a string containing 
//                 // "\n" for Unix platforms.
//                 fileWriter.append(System.lineSeparator());
//                 //#endregion

//                 fileWriter.write("new line");
//                 fileWriter.append("new line");
//                 fileWriter.flush();
//                 fileWriter.close();
//                 // BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                 // line = bufReader.readLine();
//                 // bufReader.close();
//             }
//         } catch (Exception e) {
//             //e.printStackTrace();
//         } finally {
//             System.out.println(line);
//         }
//     }
// }

// Если можно избежать try catch, то лучше это сделать

// ФУНКЦИОНАЛ РАБОТЫ С ФАЙЛОВОЙ СИСТЕМОЙ
// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог


// РАБОТА С БИНАРНЫМИ ФАЙЛАМИ

// import java.io.*;
// import java.nio.ByteBuffer;
// import java.nio.ByteOrder;
// import java.nio.charset.Charset;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;

// public class Ex004_bFile {

//     static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
//     static Map<String, String> data = new HashMap<>();
//     static Charset charset = StandardCharsets.UTF_8;

//     static void loadFile(String path) throws IOException {
//         try (InputStream stream = 
//         new BufferedInputStream(new FileInputStream(path))) {
//             int n = readInt(stream);
//             int b1;
//             int b2;
//             byte binWord[];
//             byte binText[];
//             for (int i = 0; i < n; i++) {
//                 binWord = new byte[readInt(stream)];
//                 binText = new byte[readInt(stream)];
//                 b1 = stream.read(binWord);
//                 b2 = stream.read(binText);
//                 if (b1 != binWord.length || b2 != binText.length)
//                     throw new IOException("Error read file");
//                 data.put(new String(binWord, charset), 
//                          new String(binText, charset));
//             }
//         }
//     }

//     static void saveFile(String path) throws IOException {
//         if (data.size() == 0)
//             throw new IOException("Nothing to write");
//         try (OutputStream stream = new BufferedOutputStream(new FileOutputStream(path, false))) {
//             writeInt(stream, data.size());
//             byte binWord[];
//             byte binText[];
//             for (Entry<String, String> entry : data.entrySet()) {
//                 binWord = entry.getKey().getBytes(charset);
//                 writeInt(stream, binWord.length);
//                 binText = entry.getValue().getBytes(charset);
//                 writeInt(stream, binText.length);
//                 stream.write(binWord);
//                 stream.write(binText);
//             }
//         }
//     }

//     static void delete(String word) {
//         data.remove(word);
//     }

//     static void add(String word, String text) throws Exception {
//         if (data.get(word) != null)
//             throw new Exception("Word already exist");
//         data.put(word, text);
//     }

//     static String find(String word) {
//         String out = data.get(word);
//         if (out == null)
//             return "не найдено";
//         else
//             return out;
//     }

//     static int readInt(InputStream in) throws IOException {
//         byte out[] = new byte[4];
//         int i = in.read(out);
//         if (i != 4)
//             throw new IOException("Error read file");
//         return ByteBuffer.wrap(out).order(bOrder).getInt();
//     }

//     static void writeInt(OutputStream out, int num) throws IOException {
//         ByteBuffer dbuf = ByteBuffer.allocate(4);
//         dbuf.order(bOrder).putInt(num);
//         out.write(dbuf.array());
//     }

//     public static void main(String[] args) {
//         String file = "test.bin";
//         //create file
        
//         try {
//             add("key1", "значение 1");
//             add("key2", "значение 2");
//             add("key4", "значение 3");
//             saveFile(file);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         //read file
        
//         try {
//             loadFile(file);
//             String key1 = "key1";
//             String key2 = "key2";
//             String key3 = "key3";
//             System.out.printf("%s: %s\n", key1, find(key1));
//             System.out.printf("%s: %s\n", key2, find(key2));
//             System.out.printf("%s: %s\n", key3, find(key3));
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


// ЛОГИРОВАНИЕ
// Рано или поздно система начинает сбоить, поэтому нужно вести логирование (журналирование), чтобы видеть, что именно привело к сбою.
// Для того, чтобы внедрить в свою систему логирование нужно:
// Использование
// Logger logger = Logger.getLogger()
// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter


// package Lesson_02;
// import java.io.IOException;
// import java.util.logging.*;

class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        // SimpleFormatter sFormat = new SimpleFormatter();
        // //XMLFormatter xml = new XMLFormatter();
        // fh.setFormatter(sFormat);
        // //fh.setFormatter(xml);
        
        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}