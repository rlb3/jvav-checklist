(ns avbooth-checklist.views.video
  (:require [avbooth-checklist.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]))

(def pre-checks (atom []))

(def post-checks (atom []))

(defn add-pre-check [task]
  (swap! pre-checks conj task))

(defn add-post-check [task]
  (swap! post-checks conj task))

(add-pre-check "Turn on the outside monitor")
(add-pre-check "Turn on all monitors in the booth")
(add-pre-check "Set out camera to the correct view")


(defpartial item [t]
  [:li (check-box t) (label t t)])

(defpage [:get "/video"] []
  (common/layout
   [:div#pre
    [:ul
     (map item @pre-checks)]]))
