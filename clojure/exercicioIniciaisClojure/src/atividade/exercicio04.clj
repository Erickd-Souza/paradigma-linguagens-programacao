;Peça uma temperatura em Celsius e exiba em Fahrenheit. Fórmula: F = (C * 9 / 5) + 32 Exemplo:
;Digite a temperatura em Celsius: 25 25°C equivalem a 77°F

(ns atividade.exercicio04)

(defn -main []
    (print "Digite a temperatura em Celsus: ") (flush)
    (let [c (Double/parseDouble (read-line))
        f (+ (* c 9/5) 32)]
        (println c "°C equivalem a" f "°F")
    )
)