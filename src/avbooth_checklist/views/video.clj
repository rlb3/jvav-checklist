(ns avbooth-checklist.views.video
  (:require [avbooth-checklist.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]
        [avbooth-checklist.models.video]))

(defpartial item [t]
  [:label.checkbox [:li (check-box (apply str "pre" (:id t))) (:task t)]])

(defpage [:get "/video"] []
  (common/layout
   [:div.container-fluid
    [:div.row-fluid
     [:div.span10
      [:h2 [:p [:strong "Pre Service Check List"]]]
      [:form.well
       [:div#pre
        [:ul.unstyled
         (for [t (get-pre-checks)]
           [:label.checkbox [:li (check-box (str "pre" (:id t))) (:task t)]])]]]
      [:h2 [:p "Post Server Check List"]]]]]))
