# Дано целое число N (> 0). Найти сумму N^2 + (N + 1)^2 + (N + 2)^2 + … + (2·N)^2 (целое число).

n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

0..n
|> Enum.map(fn i -> n + i end)
|> IO.inspect()
|> Enum.map(fn i -> i * i end)
|> IO.inspect()
|> Enum.sum()
|> IO.inspect()
