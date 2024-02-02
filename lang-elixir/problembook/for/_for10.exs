# Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + … + 1/N (вещественное число).

n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

1..n
|> IO.inspect()
|> Enum.map(fn i -> 1.0 / i end)
|> IO.inspect()
