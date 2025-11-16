; Leia a idade do usuário e diga se é maior ou menor de idade. Utilize `def` para a idade mínima e`let` para a variável local de idade.

(ns atividade.exercicio01)

(def idade-legal 18)

(defn -main []
    (print "Idade:") (flush)
    (let [idade (Integer/parseInt (read-line))]
        (if (>= idade idade-legal)
            (println "Maior de idade.")
            (println "Menor de idade.")
        )
    )
)