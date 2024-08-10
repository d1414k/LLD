## Observer design pattern
1. This is a behavioural design pattern
2. Lets say we have some subject to which multiple objects are observing called observers
3. If there is any change all the observs will be notified
4. Realworld example : Order status (subject) -> send notification via whatsapp, sms (observers)

### when
1. When we have publisher subscriber model
2. when we need to notifiy some change to other objects


### why

### how
1. Create subject with all register, remove and notify methods
2. Create Observer interace with update method which all observer neeed to implement
3. Once there is change in data call notify method if subject which will internally calls update method of all observers.
