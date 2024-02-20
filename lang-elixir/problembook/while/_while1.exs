# While1. Даны положительные числа A и B (A > B).
# На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
# Не используя операции умножения и деления, найти длину незанятой части отрезка A

defmodule While1 do
  def fun(a, b) when a < b, do: raise(ArgumentError, "error : A > B")
  def fun(a, b) when a - b < b, do: a - b
  def fun(a, b), do: fun(a - b, b)
end


While1.fun(2,3)
|>IO.inspect()
While1.fun(10, 3)
|> IO.inspect()
