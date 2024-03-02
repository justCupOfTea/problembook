# Series8. Дано целое число N и набор из N целых чисел.
# Вывести в том же порядке все четные числа из данного набора и количество K таких чисел

defmodule Series8 do
  def main(n \\ 3, acc \\ 0)
  def main(0, acc), do: IO.inspect(acc)

  def main(n, acc) do
    value =
      IO.gets("value: ")
      |> String.trim()
      |> String.to_integer()

    if(rem(value, 2) == 0) do
      IO.inspect(value)
      main(n - 1, acc + 1)
    else
      main(n - 1, acc)
    end
  end
end

n =
  IO.gets("N: ")
  |> String.trim()
  |> String.to_integer()

Series8.main(n)
