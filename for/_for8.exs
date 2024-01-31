# Даны два целых числа A и B (A < B).
# Найти произведение всех целых чисел от A до B включительно.

a =
  IO.gets("Input A: ")
  |> String.trim()
  |> String.to_integer()

b =
  IO.gets("Input B: ")
  |> String.trim()
  |> String.to_integer()

if a > b do
  raise ArgumentError, message: "A > B"
end

IO.inspect(a * b)
