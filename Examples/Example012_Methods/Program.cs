// Вид 1 (ничего не принимает и ничего не возвращает)
void Method1()
{
    Console.WriteLine("Автор ...");
}

Method1(); //вызов метода
//Method1 без () вызовет ошибку


//Вид 2 (что-то принимает, ничего не возвращает)
void Method2(string msg)
{
    Console.WriteLine(msg);
}
Method2(msg: "Текст сообщения");

void Method21 (string msg, int count)
{
    int i = 0;
    while (i < count)
    {
        Console.WriteLine(msg);
        i++;
    }
}
Method21(msg: "Текст", count: 4); //msg, count - именованные аргументы можно писать не по порядку
//Method21 (count: 4, msg: "Text2"); //такой вызов будет идентичен верхнему

//Вид 3 (что-то возвращает, но ничего не принимает)
int Method3()
{
    return DateTime.Now.Year;
}
int year = Method3(); //вызываем метод
Console.WriteLine(year); //выводим в консоль

//Вид4 (что-то принимает и что-то возвращает)
string Method4(int count, string text)
{
    int i = 0;
    string result = String.Empty; // либо "" - пустая строка

    while (i < count)
    {
        result = result + text;
        i++;
    }
    return result;
}

string res = Method4(10, "asdf");
Console.WriteLine(res);

//цикл for
string MethodFor(int count, string text)
{
    string result = String.Empty;
    for(int i = 0; i < count; i++)
    {
        result = result + text;
    }
    return result;
}
string res1 = MethodFor(10, "z");
Console.WriteLine(res1);

//цикл в цикле
//таблица умножений

 for (int i = 2; i <= 10; i++)
 {
    for (int j = 2; j <= 10; j++)
    {
        Console.WriteLine($"{i} x {j} = {i * j}");
    }
    Console.WriteLine();
 }

 //Задача 1
 //Дан текст. В тексте нужно все пробелы заменить черточками,
 //маленькие буквы "к" заменить большими "К", а большие "С" заменить
 //маленькими "с".

 //Ясна ли задача? Нужно задать себе несколько уточняющих вопросов
 // 1. Что значит "Дан текст"? Он берется из базы, или он вводится пользователем с клавиатуры? В нашем
 //случае будем считать, что он хранится как отдельная строка.
 // 2. Что значит "черточками?" Тире, знак минуса или дефис, или символ подчеркивания?
 // 3. Какого алфавита? Некоторые символы в алфавитах разных стран выглядят одинаково. Это кириллица или латинница?

 string text = "- Я думаю, - сказал князь, улыбаясь, - что "
            + "ежели бы вас послали вместо нашего милого Винценгероде,"
            + "вы бы взяли приступом согласие прусского короля."
            + "Вы так красноречивы. Вы дадите мне чаю?";


// string s = "qwerty"
//             012345
// s[3] // r

string Replace(string text, char oldValue, char newValue)
{
    string result = string.Empty; //сначала результат пустая строка

    int length = text.Length; // длинна строки
    for (int i = 0; i < length; i++)
    {
        if(text[i] == oldValue) result = result + $"{newValue}"; 
        //если текущее значение совпадает с запросом, то в результат положить новое значение
        else result = result + $"{text[i]}";
        //если не совпадает, то в результат нужно положить текущий символ
    }
    return result; // вывод результата
}

string newText = Replace(text, ' ', '|'); //Replace - команда замены
Console.WriteLine(newText);
Console.WriteLine();
newText = Replace(newText, 'к', 'К');
Console.WriteLine(newText);
Console.WriteLine();
newText = Replace(newText, 'С', 'с');
Console.WriteLine(newText);
Console.WriteLine();



int[] arr = {1, 5, 4, 3, 2, 6, 7, 1, 1}; // дан вот такой массив чисел

void PrintArray(int[] array) // 1. метод, который выводит массив
{
    int count = array.Length;
    for (int i=0; i<count; i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}

PrintArray(arr); // вызываем метод, используя массив arr

void SelectionSort(int[] array) // 2. Метод, который будет сортировать массив
{
    for (int i=0; i<array.Length - 1; i++)
    {
        int minPosition = i; //определяем начальную позицию
        for (int j = i + 1; j < array.Length; j++)
        {
            if(array[j] < array[minPosition]) minPosition = j;
        }
        // дальше делаем обмен позиций
        int temporary = array[i]; // рабочая позиция - это начальная позиция
        array[i] = array[minPosition]; // записываем минимальную позицию
        array[minPosition] = temporary; // в минимальную позицию кладем элемент, который был временным

    }
}


SelectionSort(arr); //вызываем метод упорядочивания
PrintArray(arr); //выводим упорядоченный список



//Задача
//Упорядочить список в обратном порядке

void SelectionSort1(int[] array) // 2. Метод, который будет сортировать массив в обратном порядке
{
    for (int i=0; i<array.Length - 1; i++)
    {
        int minPosition = i; //определяем начальную позицию
        for (int j = i + 1; j < array.Length; j++)
        {
            if(array[j] > array[minPosition]) minPosition = j;
        }
        // дальше делаем обмен позиций
        int temporary = array[i]; // рабочая позиция - это начальная позиция
        array[i] = array[minPosition]; // записываем минимальную позицию
        array[minPosition] = temporary; // в минимальную позицию кладем элемент, который был временным

    }
}


SelectionSort1(arr); //вызываем метод упорядочивания
PrintArray(arr); //выводим упорядоченный список