Feature: Efetuando Login no Itau

@issue:LINO-1
  Scenario: Fazer Login no site do itau
  	Given o usuario coloque login e senha
  	When loga '140312'
  	Then faz um pagamento