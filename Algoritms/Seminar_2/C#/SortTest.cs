using BenchmarkDotNet.Attributes;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lesson2_1
{
    [MemoryDiagnoser]
    public class SortTest
    {
        private int[] array = ArrayUtils.prepareArray(1000);


        [Benchmark]
        public void DirectSortTest()
        {
            SortUtils.directSort(array);
        }

        [Benchmark]
        public void QuickSortTest()
        {
            SortUtils.quickSort(array);
        }

        [Benchmark]
        public void InsertSortTest()
        {
            SortUtils.insertSort(array);
        }

    }
}
