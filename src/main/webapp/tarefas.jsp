<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<html>
  <head>
      <title>Tarefas</title>
      <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

  </head>
  <body>
    <%@include file="cabecalho.jsp"%>
    <div class="p-8">
      <h2 class="text-xl font-semibold mb-4">Adicionar Tarefa</h2>
      <form action="tarefas" method="post" class="space-y-4">
        <input type="text" id="titulo" name="titulo" placeholder="Título" class="w-full p-2 border rounded" required>
        <textarea id="descricao" name="descricao" placeholder="Descrição" class="w-full p-2 border rounded" required></textarea>
        <button type="submit" class="bg-blue-600 text-white px-4 py-2 rounded">Salvar</button>
        <a href="tarefas" class="bg-gray-500 text-white px-4 py-2 rounded inline-block ml-4 hover:bg-gray-600">Voltar</a>      </form>
    </div>
    </body>
</html>
