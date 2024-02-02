# Даны два целых числа A и B (A < B).
# Вывести в порядке убывания все целые числа, расположенные между A и B (не включая числа A и B),
# а также количество N этих чисел

a =
  IO.gets("Input A: ")
  |> String.trim()
  |> String.to_integer()

b =
  IO.gets("Input B: ")
  |> String.trim()
  |> String.to_integer()

n1 = max(a, b)
n2 = min(a, b)

Enum.map((n1 - 1)..(n2 + 1), fn i -> i end)
|> IO.inspect()
|> Enum.count()
|> IO.inspect()
