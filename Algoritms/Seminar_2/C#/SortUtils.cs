using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2_1
{
    public static class SortUtils
    {
        /// <summary>
        /// Сортировка вставками
        /// </summary>
        /// <param name="arr"></param>
        public static void insertSort(int[] arr)
        {
            for (int i = 1; i < arr.Length; i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (arr[j - 1] > arr[j])
                    {
                        int buf = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = buf;
                    }
                }
            }
        }

        /// <summary>
        /// Сортировка выбором
        /// </summary>
        /// <param name="arr"></param>
        public static void directSort(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                int save = i;
                for (int j = i + 1; j < arr.Length; j++)
                {
                    if (arr[j] < arr[save])
                        save = j;
                }
                if (save != i)
                {
                    int buf = arr[i];
                    arr[i] = arr[save];
                    arr[save] = buf;
                }
            }
        }

        /// <summary>
        /// Быстрая сортировка
        /// </summary>
        /// <param name="arr"></param>
        public static void quickSort(int[] arr)
        {
            quickSort(arr, 0, arr.Length - 1);
        }

        static void quickSort(int[] arr, int start, int end)
        {
            int left = start;
            int right = end;
            int middle = arr[(left + right) / 2];

            do
            {
                while (arr[left] < middle)
                    left++;

                while (arr[right] > middle)
                {
                    right--;
                }

                if (left <= right)
                {

                    if (left < right)
                    {
                        int buf = arr[left];
                        arr[left] = arr[right];
                        arr[right] = buf;
                    }
                    left++;
                    right--;
                }
            }
            while (left <= right);

            if (left < end)
                quickSort(arr, left, end);
            if (start < right)
                quickSort(arr, start, right);
        }
    }
}
