; Leia a idade e, se for maior ou igual a 18, exiba as mensagens 'Maior de idade' e 'Pode dirigir'.

(ns atividade.exercicio04)

(defn -main []
    (println "Digite a Idade: ") (flush)
    (let [idade (Integer/parseInt (read-line))]
        (when (>= idade 18)
            (println "Maior de idade")
            (println "Pode dirigir")
        )
    )
)