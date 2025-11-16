;Leia um número inteiro e calcule o fatorial usando loop e recur

(ns atividade.exercicio03)

(defn -main []
    (print "Digite um número: ") (flush)
    (let [n (Integer/parseInt (read-line))]
        (loop [i 1 fat 1]
            (if (> i n)
                (println "Fatorial de" n "é" fat)
                (recur (inc i) (* fat i))
            )
        )
    )
)