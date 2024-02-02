# Дано целое число N (> 0). Найти значение выражения 1.1 – 1.2 + 1.3 – …
# (N слагаемых, знаки чередуются). Условный оператор не использовать.

n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

1..n
|> Enum.map(fn i -> :math.pow(-1, i - 1) * (1 + i * 0.1) end)
|> IO.inspect()
|> Enum.sum()
|> IO.inspect()
