;Peça um número de 1 a 7 e exiba o nome do dia correspondente. Caso o número seja inválido, exiba 'Dia inválido'.

(ns atividade.exercicio02)

(defn -main []
    (println "Digite um número (1-7): ") (flush)
    (let [n (Integer/parseInt (read-line))]
        (cond
            (= n 1) (println "Domingo")
            (= n 2) (println "Segunda-Feira")
            (= n 3) (println "Terça-Feira")
            (= n 4) (println "Quarta-Feira")
            (= n 5) (println "Quinta-Feira")
            (= n 6) (println "Sexta-Feira")
            (= n 7) (println "Sábado")
            :else (println "Dia inválido")
        )
    )
)