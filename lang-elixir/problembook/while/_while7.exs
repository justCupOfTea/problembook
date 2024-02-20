# While7°. Дано целое число N (> 0).
# Найти наименьшее целое положительное число K,
#  квадрат которого превосходит N: K2 > N.
#  Функцию извлечения квадратного корня не использовать
defmodule While7 do
  def fun(n, k \\ 0)
  def fun(n, _k) when n <= 0, do: raise("Error: N>0")
  def fun(1, _k), do: 2
  def fun(n, k) when n >= (k - 1) * (k - 1) and n < k * k, do: k
  def fun(n, k), do: fun(n, k + 1)
end

While7.fun(1)
# 2
|> IO.inspect()

While7.fun(2)
# 2
|> IO.inspect()

While7.fun(27)
# 6
|> IO.inspect()

While7.fun(-1)
# error
|> IO.inspect()
