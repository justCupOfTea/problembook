# Дано вещественное число A и целое число N (> 0).
# Найти A в степени N: AN = A·A· … ·A (числа A перемножаются N раз).
n =
  IO.gets("Input N: ")
  |> String.trim()
  |> String.to_integer()

a =
  IO.gets("Input a: ")
  |> String.trim()
  |> String.to_integer()

if n <= 0 do
  reraise ArgumentError, message: "N <= 0"
end

:math.pow(a, n)
|> IO.inspect()
