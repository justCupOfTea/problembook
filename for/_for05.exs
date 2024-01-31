# Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1, 0.2, …, 1 кг конфет.

price =
  IO.gets("Input price: ")
  |> String.trim()
  |> String.to_float()

Enum.map(1..10, fn i -> i / 10.0 * price end)
|> IO.inspect()
