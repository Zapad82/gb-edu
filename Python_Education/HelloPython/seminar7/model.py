import sympy

def evaluate_expr(expr):
    x = sympy.Symbol('x') # создаем символ, переменную, в отношении которой будет решаться уравнение
    return str(sympy.solve(expr,x))