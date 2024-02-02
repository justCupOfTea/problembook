# Дано целое число N (> 0). Найти произведение 1.1 · 1.2 · 1.3 · … (N сомножителей).

n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

1..n
|> Enum.map(fn i -> 1 + i * 0.1 end)
|> Enum.to_list()
|> IO.inspect()
|> Enum.product()
|> IO.inspect()
