(ns avbooth-checklist.views.welcome
  (:require [avbooth-checklist.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to avbooth-checklist"]))
