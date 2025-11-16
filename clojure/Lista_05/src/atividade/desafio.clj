; Armazene as idades de 5 pessoas em um vetor e calcule: média, mais novo, mais velho e quantos têm idade ≥ 18.

(ns atividade.desafio)

(def idades [18 22 15 40 30])

(defn media [v]
    (double (/ (reduce + v) (count v)))
)

(defn -main []
    (println "Idades:" idades)
    (println "Média:" (media idades))
    (println "Mais novo:" (apply min idades))
    (println "Mais velho:" (apply max idades))
    (println "Maiores ou iguais a 18:" (count (filter #(>= % 18) idades)))
)