# Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет

price =
  IO.gets("Input price : ")
  |> String.trim()
  |> String.to_float()

Enum.map(1..10, fn i -> i * price end)
|> IO.inspect()
