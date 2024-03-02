# While11°. Дано целое число N (> 1).
# Вывести наименьшее из целых чисел K, для которых сумма 1 + 2 + … + K
# будет больше или равна N, и саму эту сумму.

defmodule While11 do
  def mink(n, sum \\ 0, k \\ 1), do: _minK(n, sum, k)
  defp _minK(n, _sum, _k) when n <= 1, do: raise("N>1")
  defp _minK(n, sum, k) when sum >= n, do: {k,sumK(k)}
  defp _minK(n, sum, k), do: _minK(n, sum + k, k + 1)

  def sumK(k), do: _sumK(k)
  defp _sumK(k) when k < 0, do: raise("K<0")
  defp _sumK(k), do: 1..k |> Enum.sum()
end

While11.mink(2)
|> IO.inspect()
|> While11.sumK()
|> IO.inspect()

While11.mink(3)
|> IO.inspect()
|> While11.sumK()
|> IO.inspect()

While11.mink(9)

|> IO.inspect()
|> While11.sumK()
|> IO.inspect()

While11.mink(1)
|> IO.inspect()
