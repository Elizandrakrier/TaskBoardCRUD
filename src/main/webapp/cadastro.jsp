<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
  <head>
      <title>Cadastro</title>
     <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

  </head>
  <body>
    <div class="h-screen flex items-center justify-center bg-gray-100">
      <form action="cadastro" method="post" class="bg-white p-8 rounded shadow-md w-full max-w-md">
        <h2 class="text-2xl font-semibold mb-6 text-center">Task Board - Cadastro</h2>

        <input type="text" name="nome" placeholder="Nome completo"
               class="w-full mb-4 p-2 border rounded" required>

        <input type="email" name="email" placeholder="E-mail"
               class="w-full mb-4 p-2 border rounded" required>

        <input type="text" name="cpf" placeholder="CPF"
               class="w-full mb-4 p-2 border rounded" required>

        <input type="password" name="senha" placeholder="Senha"
               class="w-full mb-6 p-2 border rounded" required>

        <button type="submit"
                class="w-full bg-green-600 text-white py-2 rounded hover:bg-green-700">
          Criar conta
        </button>

        <p class="mt-4 text-center text-sm">
          Já tem uma conta?
          <a href="login.jsp" class="text-blue-600 underline">Faça login</a>
        </p>
      </form>
    </div>
  </body>
</html>
