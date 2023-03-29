using BenchmarkDotNet.Running;

namespace Lesson2_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BenchmarkSwitcher
                .FromAssembly(typeof(Program).Assembly)
                .Run(args, new BenchmarkDotNet.Configs.DebugInProcessConfig());
            BenchmarkRunner.Run<SortTest>();
        }
    }
}