# While24. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом:
# F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … .
# Проверить, является ли число N числом Фибоначчи. Если является, то вывести True, если нет — вывести False

defmodule While24 do
  def fib(n, f1 \\ 1, f2 \\ 1, f \\ 0), do: _fib(n, f1, f2, f)
  def _fib(n, _f1, _f2, _f) when n <= 0, do: raise(ArgumentError, "error")
  def _fib(n, _f1, _f2, f) when f == n, do: true
  def _fib(n, _f1, _f2, f) when f > n, do: false
  def _fib(n, f1, f2, f), do: _fib(n, f, f1, f1 + f2)
end

IO.gets("Input N: ")
|> String.trim()
|> String.to_integer()
|> While24.fib()
|> IO.inspect()
