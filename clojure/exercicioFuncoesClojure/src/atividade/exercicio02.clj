; Crie uma função `quadrado` que receba um número e retorne seu valor ao quadrado. Implemente também uma versão anônima utilizando `#()`.

(ns atividade.exercicio02)

(defn quadrado [n]
    (* n n)
)

(def quadrado-anonimo #(* % %))

(defn -main []
    (println "Quadrado  (defn):" (quadrado 4))
    (println "Quadrado (anonimo):" (quadrado-anonimo 4))
)