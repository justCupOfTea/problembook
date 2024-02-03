# Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2, 1.4, …, 2 кг конфет

price =
  IO.gets("Input price: ")
  |> String.trim()
  |> String.to_float()

Enum.map(12..20//2, fn i -> i / 10.0 * price end)
|> IO.inspect()
