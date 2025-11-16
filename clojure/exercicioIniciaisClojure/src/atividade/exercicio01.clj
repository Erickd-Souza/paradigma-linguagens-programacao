; Peça o nome do usuário e imprima uma saudação. Exemplo de saída: Qual é o seu nome? João 
;Olá, João! Bem-vindo ao Clojure.

(ns atividade.exercicio01)

(defn -main []
    (print "Qual é o seu nome? ") (flush)
    (let [nome (read-line)]
        (println "Olá," nome "! Bem-Vindo ao Clojure.")
    )
)