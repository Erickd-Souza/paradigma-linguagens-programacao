;peça ao usuário um numero N e calcule a soma de 1 até N utilizando o laço loop e recur

(ns atividade.exercicio02)

(defn -main []
    (print "Digite um número: ") (flush)
    (let [n (Integer/parseInt (read-line))]
        (loop [i 1 soma 0]
            (if (> i n)
                (println "Soma Total:" soma)
                (recur (inc i) (+ soma i))
            )
        )
    )
)
