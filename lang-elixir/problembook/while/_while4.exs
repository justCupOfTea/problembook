# While4°. Дано целое число N (> 0).
# Если оно является степенью числа 3,
# то вывести True, если не является — вывести False.

defmodule While4 do
  def fun(n) when n <= 0, do: raise("Error: N>0")
  def fun(n) when n == 1, do: true
  def fun(n) when rem(n, 3) != 0, do: false
  def fun(n), do: fun(div(n, 3))
end

While4.fun(9)
|> IO.inspect()

While4.fun(4)
|> IO.inspect()
While4.fun(1)
|> IO.inspect()

While4.fun(0)
|> IO.inspect()
