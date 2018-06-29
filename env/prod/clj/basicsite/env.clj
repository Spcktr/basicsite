(ns basicsite.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[basicsite started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[basicsite has shut down successfully]=-"))
   :middleware identity})
