# Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей,
# кроме 1 и самого себя,  то вывести True, иначе вывести False.

defmodule While22 do
  def isSimple(x) when x > 1 do
    isSimple(x, 2)
  end

  #
  defp isSimple(x, n) when x == n, do: true
  defp isSimple(x, n) when rem(x, n) == 0, do: false

  defp isSimple(x, n) do
    isSimple(x, n + 1)
  end

  #
end

IO.gets("Input N: ")
|> String.trim()
|> String.to_integer()
|> While22.isSimple()
|> IO.inspect()
