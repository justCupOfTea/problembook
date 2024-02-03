# For1. Даны целые числа K и N (N > 0). Вывести N раз число K.

# Даны целые числа K и N (N > 0). Вывести N раз число K
k =
  IO.gets("Введите K: ")
  |> String.trim()
  |> String.to_integer()

n =
  IO.gets("Введите N: ")
  |> String.trim()
  |> String.to_integer()

1..n
|> Enum.map(fn i -> k end)
|> IO.inspect()
