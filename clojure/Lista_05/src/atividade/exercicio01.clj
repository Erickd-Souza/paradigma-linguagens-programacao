; Crie um vetor de nomes e exiba o primeiro e o último elemento.

(ns atividade.exercicio01)

(def nomes ["Ana" "Bruno" "Carlos" "Diana" "Eduardo"])

(defn -main []
    (println "Primeiro:" (first nomes))
    (println "Último:" (peek nomes))
)