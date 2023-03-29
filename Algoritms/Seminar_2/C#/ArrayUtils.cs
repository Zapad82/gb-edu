using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2_1
{
    internal static class ArrayUtils
    {
        private static readonly Random random = new Random();

        public static int[] prepareArray(int length)
        {
            int[] arr = new int[length];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = random.Next(-50, 51);
            }
            return arr;
        }

    }
}
