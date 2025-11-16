;Leia notas até que o usuário digite 0, filtre as notas ≥ 6 e calcule a média dos aprovados.

(ns atividade.exercicio03)

(defn ler-notas []
    (println "Digite notas (0 para encerrar):")
    (loop [acc []]
        (let [n (Double/parseDouble (read-line))]
            (if (zero? n)
                acc
                (recur (conj acc n))
            )
        )
    )
)

(defn -main []
    (let [notas (ler-notas)
        ;media (->> notas (filter #(>= % 6))
        ;    (reduce +)
        ;    (#(/ % (count (filter #(>= % 6) notas))))
        ;) Não pode colocar uma função anônima dentro de outra
        aprovados (filter #(>= % 6) notas)
        media (if (empty? aprovados)0
                (/ (reduce + aprovados) (count aprovados))
            )]
        (println "Notas digitadas:" notas)
        (println "Média dos aprovados:" media)
    )
)