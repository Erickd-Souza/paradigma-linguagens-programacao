;Crie um programa que receba uma lista de notas, some 1 ponto em cada nota, filtre apenas as notas maiores ou iguais a 6, calcule a média final e exiba o resultado.

(ns atividade.exercicio06)

(defn adicionar-bonus [nota] (+ nota 1))
(defn aprovado? [nota] (>= nota 6))
(defn media [notas] (double (/ (reduce + notas) (count notas))))

(defn -main []
    (let [notas [5.0 7.5 4.0 9.0 6.5]
        resultado (->> notas (map adicionar-bonus) 
        (filter aprovado?)
        (doall))
        media-final (media resultado)]
        (println "Notas originais:" notas)
        (println "Notas com Bônus:" (map adicionar-bonus notas))
        (println "Aprovados:" resultado)
        (println "Média dos aprovados: " media-final)
    )
)