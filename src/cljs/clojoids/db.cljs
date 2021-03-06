(ns clojoids.db)

(def default-db
  {:tick            0
   :score           0
   :paused?         false
   :bullet-cooldown 0
   :keys            #{}
   :asteroids       []
   :bullets         []
   :spaceship       {:position  [20 20]
                     :movement  [0.01 0]
                     :direction 0
                     :engine?   false}})
