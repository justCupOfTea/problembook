# Дано целое число N (> 0).
# Найти квадрат данного числа, используя для его вычисления следующую формулу:
# N2 = 1 + 3 + 5 + … + (2·N – 1).
n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

1..n
|> Enum.map(fn i -> 2 * i - 1 end)
|> IO.inspect()
|> Enum.sum()
|> IO.inspect()
