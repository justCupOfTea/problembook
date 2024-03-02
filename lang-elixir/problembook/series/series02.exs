# Даны десять вещественных чисел. Найти их произведение

defmodule Series2 do
  def main(n \\ 3, acc \\ 1)
  def main(0, acc), do: acc
  def main(n, acc) do
    x = IO.gets("value: ")
    |>String.trim
    |>String.to_float
    main(n - 1, acc * x)
  end
end


Series2.main()
|>IO.inspect
